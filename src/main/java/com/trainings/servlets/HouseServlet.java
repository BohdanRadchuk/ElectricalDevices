package com.trainings.servlets;

import com.trainings.entity.DevicesInHouse;
import com.trainings.entity.ElectricalDevice;
import com.trainings.service.EnergyCalculator;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class HouseServlet extends HttpServlet {
    private static final String HOUSE_DEVICES = "HouseDevices";
    private static final String TOTAL_ENERGY = "totalEnergy";
    private static final String HOUSE_JSP = "house.jsp";
    public static final String REDIRECT_URL = "/house";
    private static final String POWER_CHECKBOX_NAME = "switchOption";

    private DevicesInHouse devicesInHouse = DevicesInHouse.getInstance();

    private ArrayList<ElectricalDevice> electricalDevices;


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (devicesInHouse.getAllDevicesInHouse().isEmpty()) {
            electricalDevices = devicesInHouse.buyAllDevices();
        }

        req.setAttribute(HOUSE_DEVICES, electricalDevices);
        req.setAttribute(TOTAL_ENERGY, EnergyCalculator.totalEnergyConsuming(electricalDevices));

        req.getRequestDispatcher(HOUSE_JSP).forward(req, resp);
    }

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        for (int i = 0; i < electricalDevices.size(); i++) {

            //each checkbox name consists of name and array index
            if (req.getParameter(POWER_CHECKBOX_NAME + i) != null) {
                electricalDevices.get(i).turnOn();
            } else {
                electricalDevices.get(i).turnOff();
            }
        }
        //devicesSorter.sortElectricalDevicesByPower(electricalDevices);
        //req.setAttribute(HOUSE_DEVICES, electricalDevices);
        resp.sendRedirect(REDIRECT_URL);
        //req.getRequestDispatcher(HOUSE_JSP).forward(req, resp);
    }
}
