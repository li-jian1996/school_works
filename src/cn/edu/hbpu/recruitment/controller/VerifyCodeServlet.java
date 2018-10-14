package cn.edu.hbpu.recruitment.controller;

import java.awt.image.BufferedImage;
import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;

import cn.edu.hbpu.recruitment.util.VerifyCode;
public class VerifyCodeServlet extends HttpServlet {
	public void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		VerifyCode vc = new VerifyCode();
		BufferedImage image = vc.getImage();// ��ȡһ������֤��ͼƬ
		// �÷���������getImage()����֮��������
		// System.out.println(vc.getText());//��ȡͼƬ�ϵ��ı�
		VerifyCode.output(image, response.getOutputStream());// ��ͼƬд��ָ������
		// ���ı����浽session�У�ΪLoginServlet��֤��׼��
		request.getSession().setAttribute("vCode", vc.getText());
	}

}
