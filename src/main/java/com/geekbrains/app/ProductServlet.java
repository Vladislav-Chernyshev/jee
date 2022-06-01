package com.geekbrains.app;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

@WebServlet(name = "Product", urlPatterns = "/product_page")
public class ProductServlet extends HttpServlet {
    private static Logger logger = LoggerFactory.getLogger(ProductServlet.class);


    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        logger.info("Log: Product");
        PrintWriter out = resp.getWriter();
        resp.setContentType("text/html;charset=UTF-8");
        List<Product> list = new ArrayList();

        list.add(new Product(1, "Milk", 2.00));
        list.add(new Product(2, "Bread", 0.99));
        list.add(new Product(3, "Sugar", 1.59));
        list.add(new Product(4, "Cheese", 3.00));
        list.add(new Product(5, "Coca-cola", 1.00));
        list.add(new Product(6, "Fanta", 1.00));
        list.add(new Product(7, "Coffee", 4.00));
        list.add(new Product(8, "Tea", 2.00));
        list.add(new Product(9, "Chocolate", 1.30));
        list.add(new Product(10, "Yogurt", 2.00));

        out.printf("<html><body>");

        for (Product product : list) {
            out.printf("<h1>id: %d, title: %s, cost: %.2f </h1>", product.getId(), product.getTitle(), product.getCost());
        }

        out.printf("</html></body>");
        out.close();

    }

    @Override
    public void init() throws ServletException {
        logger.debug("Init");
    }
}
