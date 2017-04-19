package controllers;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import db.Cuenta_DTO;
import model.CuentasModel;

/**
 * Servlet implementation class CargarCuentas
 */
@WebServlet("/cargarCuentas")
public class CargarCuentas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public CargarCuentas() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		ArrayList <Cuenta_DTO> cuentas = new ArrayList <Cuenta_DTO>();
		
		CuentasModel cm = new CuentasModel();
		
		cuentas.add(new Cuenta_DTO(cm.getIdMax() + 1,request.getParameter("nombre"),Double.parseDouble(request.getParameter("valor")),
				Integer.parseInt(request.getParameter("fecha"))));
		
		int codOp = cm.saveCuentas(cuentas);
		request.setAttribute("codId", codOp);
		request.getRequestDispatcher("confirmacionCarga.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
