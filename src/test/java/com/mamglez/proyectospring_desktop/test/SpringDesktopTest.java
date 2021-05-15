/**
 * 
 */
package com.mamglez.proyectospring_desktop.test;

import static org.junit.Assert.assertNotNull;

import java.util.Properties;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.mamglez.proyectospringdesktop.dao.impl.DisqueraDAOImpl;

/**
 * @author skype
 *
 */
public class SpringDesktopTest {

	@Test
	public void testContext() {
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		assertNotNull(context);
		DisqueraDAOImpl disqueraDAO = (DisqueraDAOImpl) context.getBean("disqueraDAO");
		assertNotNull(disqueraDAO);
		System.out.println("contexto cargado");
		System.out.println(disqueraDAO);
		
		Properties properties = (Properties) context.getBean("properties");
		System.out.println(properties.getProperty("spring-username"));
	}

}
