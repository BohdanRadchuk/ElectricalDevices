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

public class SortServlet extends HttpServlet {


    private DevicesInHouse devicesInHouse = DevicesInHouse.getInstance();
    private DevicesSorter devicesSorter = new DevicesSorter();
    private ArrayList<ElectricalDevice> electricalDevices = devicesInHouse.getAllDevicesInHouse();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        electricalDevices = new ArrayList<>(devicesSorter.sortElectricalDevicesByPower(electricalDevices));
        System.out.println(electricalDevices);

        resp.sendRedirect(HouseServlet.REDIRECT_URL);
    }
}
