package com.trainings.servlets;

import com.trainings.entity.ElectricalDevice;
import com.trainings.service.House;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;

public class HouseServlet extends HttpServlet {
    private House house = new House();


    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (house.getAllDevicesInHouse().isEmpty()){
            house.buyAllDevices();
        }
        ArrayList<ElectricalDevice> electricalDevices = house.getAllDevicesInHouse();
        for (ElectricalDevice ads: electricalDevices
             ) {
            System.out.println(ads.getEnergyConsuming());
        }
        req.setAttribute("HouseDevices", electricalDevices);

        req.getRequestDispatcher("house.jsp").forward(req,resp);
    }
}
