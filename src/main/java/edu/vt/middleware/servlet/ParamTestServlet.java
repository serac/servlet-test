package edu.vt.middleware.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Map;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by marvin on 7/17/14.
 */
public class ParamTestServlet extends HttpServlet {

  @Override
  protected void service(
      final HttpServletRequest req, final HttpServletResponse resp)
      throws ServletException, IOException {

    resp.setContentType("text/plain");
    final PrintWriter writer = resp.getWriter();
    writer.write("Parameters:\n");
    for (Map.Entry<String, String[]> entry : req.getParameterMap().entrySet()) {
      writer.write(entry.getKey() + " = " + Arrays.asList(entry.getValue()) + "\n");
    }
  }
}
