package com.trainings.servlets;

import com.trainings.entity.DevicesInHouse;
import com.trainings.entity.ElectricalDevice;
import com.trainings.service.DevicesSorter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class SearchByPropertyServlet extends HttpServlet {

    private static final String START_PARAMETER = "powerStart";
    private static final String END_PARAMETER = "powerEnd";
    private static final String ERROR_MESSAGE_ATTRIBUTE = "errorMessage";
    private static final String WRONG_INPUT = "Wrong input";
    private static final String NO_MATCH_ERROR = "Sorry no match in this diapason";
    private static final String DEVICES_LIST_ATTRIBUTE = "matchedDevices";
    private static final String FILTERED_JSP = "/filtered.jsp";

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String powerStart = req.getParameter(START_PARAMETER);
        String powerEnd = req.getParameter(END_PARAMETER);
        boolean inputCorrect = DevicesSorter.checkForInt(powerStart) && DevicesSorter.checkForInt(powerEnd);
        ArrayList<ElectricalDevice> matchedDevices = new ArrayList<>();

        if (inputCorrect) {
            matchedDevices = DevicesInHouse.getInstance().matchedDevicesInRange(powerStart, powerEnd);
            req.setAttribute(DEVICES_LIST_ATTRIBUTE, matchedDevices);
        } else {
            req.setAttribute(ERROR_MESSAGE_ATTRIBUTE, WRONG_INPUT);
        }
        if (matchedDevices.isEmpty() && inputCorrect) {
            req.setAttribute(ERROR_MESSAGE_ATTRIBUTE, NO_MATCH_ERROR);
        }
        req.getRequestDispatcher(FILTERED_JSP).forward(req, resp);
    }
}
