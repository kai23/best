package com.ingesup.test;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import com.ingesup.InterfacesDao.BrandsDao;
import com.ingesup.JpaDao.JpaBrandsDao;
import com.ingesup.greenIT.Brands;


public class TestJpa {

	@Before
	public void setUp() throws Exception {
	}

	@Test
	public void test() {
		BrandsDao brandsDAO = new JpaBrandsDao();
		Brands b = new Brands();
		b.setName("toto");
		brandsDAO.persist(b);
	}

}
