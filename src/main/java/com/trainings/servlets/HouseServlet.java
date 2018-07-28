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
    ArrayList<ElectricalDevice> electricalDevices = house.getAllDevicesInHouse();

    public void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (house.getAllDevicesInHouse().isEmpty()){
            house.buyAllDevices();
        }

        for (ElectricalDevice ads: electricalDevices
             ) {
            System.out.println(ads.getEnergyConsuming());
        }
        req.setAttribute("HouseDevices", electricalDevices);

        req.getRequestDispatcher("house.jsp").forward(req,resp);
    }

    public void doPost (HttpServletRequest req,HttpServletResponse resp) throws ServletException, IOException{

        for (int i = 0; i<electricalDevices.size(); i++){
            if (req.getParameter("someSwitchOption"+i)!=null)electricalDevices.get(i).turnOn();
        }
        System.out.println(electricalDevices);
        boolean asd =req.getParameter("someSwitchOption1")!=null;
        System.out.println(asd);
        req.setAttribute("HouseDevices", electricalDevices);
        req.getRequestDispatcher("house.jsp").forward(req,resp);


    }
}
