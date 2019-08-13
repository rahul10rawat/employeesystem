package com.comtroller;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.SQLException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bo.LoginBO;
import com.model.Employee;
import com.model.User;

import dao.LoginDAO;
import dao.businessDAO;
import exception.BusinessException;

/**
 * Servlet implementation class LoginController
 */
@WebServlet("/empregistration")
public class EmpRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EmpRegistration() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#service(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Employee emp=new Employee();
		//user.setUser_id(Integer.parseInt(request.getParameter("userid")));
		emp.setFirst_name(request.getParameter("first_name"));
		emp.setLast_name(request.getParameter("last_name"));
		emp.setDob(request.getParameter("dob"));
		emp.setEmail(request.getParameter("email"));
		emp.setDepartment_id(request.getParameter("department_id")); 
		System.out.println("here");
		System.out.println(emp.toString());
		//LoginBO bo=new LoginBO();
		businessDAO bo = new businessDAO();
		RequestDispatcher rd=null;
		response.setContentType("text/html");
		PrintWriter out= response.getWriter();
		try{
		try {
			System.out.println("asaveEmployee reached");
			if(bo.saveEmployee(emp))
			{ System.out.println("saveEmployee sucess called");

				//request.setAttribute("role", "Hello "+ user.getRole());
				
				 
					
				rd=request.getRequestDispatcher("/WEB-INF/success.jsp");
			 
				rd.forward(request, response);
			}else
			{ System.out.println("password incorrect");
				request.setAttribute("msg", "Password is incorrect, please login again");
				
				rd=request.getRequestDispatcher("login.jsp");
				
				rd.forward(request, response);
		
			}
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}catch(BusinessException e)
		{ 
		/*rd=request.getRequestDispatcher("login.html");
		rd.include(request, response);*/
		System.out.println(e.getMessage());
		//out.print("<center><span style='color:red;'>"+e.getMessage()+"</span></center>");
		}
	}

	private businessDAO businessDAO() {
		// TODO Auto-generated method stub
		return null;
	}

}
