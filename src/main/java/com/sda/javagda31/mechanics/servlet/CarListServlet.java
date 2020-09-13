package com.sda.javagda31.mechanics.servlet;

import com.sda.javagda31.mechanics.database.EntityDao;
import com.sda.javagda31.mechanics.model.Car;
import com.sda.javagda31.mechanics.model.EngineType;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/cars")
public class CarListServlet extends HttpServlet {
    private final EntityDao<Car> entityDao = new EntityDao<Car>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("car_list", entityDao.findAll(Car.class));

        req.getRequestDispatcher("/car_list.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
