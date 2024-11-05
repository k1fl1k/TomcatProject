package com.k1fl1k.tomcatproject.servlet;

import com.k1fl1k.tomcatproject.product.Product;
import com.k1fl1k.tomcatproject.product.ProductRepository;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;
import java.util.List;

@WebServlet("/products")
public class ProductServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        ProductRepository productRepository = (ProductRepository) getServletContext().getAttribute("productRepository");
        List<Product> products = productRepository.getAllProducts();

        req.setAttribute("products", products);
        req.getRequestDispatcher("/WEB-INF/views/products.jsp").forward(req, resp);
    }
}
