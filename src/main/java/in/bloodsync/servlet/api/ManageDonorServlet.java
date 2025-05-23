package in.bloodsync.servlet.api;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;
import java.util.List;

import com.google.gson.Gson;

import in.bloodsync.dao.BloodDonorDao;
import in.bloodsync.pojo.BloodDonorPojo;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class ManageDonorServlet extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("application/json");
		PrintWriter pw = resp.getWriter();
		Gson gson = new Gson();
		try {
			List<BloodDonorPojo> donorList = BloodDonorDao.getAllDonors();
			String jsonData = gson.toJson(donorList);
			pw.print(jsonData);
		}catch(SQLException ex) {
			String errorJson = gson.toJson("status","error","message",ex.getMessage());
			pw.print(errorJson);
		}finally {
			pw.close();
		}
	}
}
