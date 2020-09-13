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

@WebServlet("/car/form")
public class CarFormServlet extends HttpServlet {
    private final EntityDao<Car> entityDao = new EntityDao<Car>();
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        req.setAttribute("engine_types", EngineType.values());

        req.getRequestDispatcher("/car_form.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Car car = Car.builder()
                .name(req.getParameter("nameField"))
                .registration(req.getParameter("registrationValue"))
                .mileage(Long.parseLong(req.getParameter("mileageValue")))
                .engineCapacity(Double.parseDouble(req.getParameter("capacityValue")))
                .vin(req.getParameter("vinValue"))
                .engineType(EngineType.valueOf(req.getParameter("engineTypeValue")))
                .build();

        entityDao.saveOrUpdate(car);

        resp.sendRedirect(req.getContextPath()+"/cars");
    }
}
