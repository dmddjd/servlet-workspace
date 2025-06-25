package com.kh.basicServlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SendRedirectServlet
 */
@WebServlet("/sendRedirect.do")
public class SendRedirectServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SendRedirectServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("sendRedirect 요청 들어옴.");
		
		// 게시판등록기능이라고 가정
		String name = request.getParameter("name");
		// 게시판 등록과 관련된 로직 수행
		// 게시글 목록페이지로 리다이렉트.
		
		// servlet이 요청내용을 위임하는 두번째 방법
		// sendRedirect
		response.sendRedirect("testPerson1.do"); 
		// 이동시킬 url주소를 작성 -> url주소창이 매개변수에 입력한 값으로 바뀜
		// request에 담겨있던 값들이 "소멸"
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
