package com.trainings.servlets;

import com.trainings.entity.DevicesInHouse;
import com.trainings.entity.ElectricalDevice;
import com.trainings.service.DevicesSorter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Redirects to {@link com.trainings.servlets.HouseServlet}
 * with sorted by electric consuming {@code List<ElectricalDevices>}
 */
public class SortServlet extends HttpServlet {

    private DevicesInHouse devicesInHouse = DevicesInHouse.getInstance();
    private DevicesSorter devicesSorter = new DevicesSorter();
    private ArrayList<ElectricalDevice> electricalDevices = devicesInHouse.getAllDevicesInHouse();

    public void doPost(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        electricalDevices = new ArrayList<>(devicesSorter.sortElectricalDevicesByPower(electricalDevices));
        resp.sendRedirect(HouseServlet.REDIRECT_URL);
    }
}
