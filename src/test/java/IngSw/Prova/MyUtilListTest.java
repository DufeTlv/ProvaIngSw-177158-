package IngSw.Prova;

import static org.junit.Assert.*;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import IngSw.Prova.MyUtilList;
import org.junit.Rule;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnit;
import org.mockito.junit.MockitoRule;
import static org.mockito.Mockito.*;

import java.time.LocalDateTime;
import java.util.Arrays;

public class MyUtilListTest {
	
	private MyUtilList mul;
	
	@BeforeClass
	public static void prepareAll() {
		//System.out.println("before class");
	}

	@AfterClass
	public static void afterClass() {
		//System.out.println("after class");
	}

	@Before
	public void prepareTest() {
		//System.out.println("before");
		mul = new MyUtilList();
	}

	@After
	public void cleanTest() {
		//System.out.println("after");
	}
	
	@Test
	public void testOrdinaCrescente() {
		//fail("Not yet implemented");
		System.out.println("Test ordinaCrescente "+ LocalDateTime.now());
		assertEquals(Arrays.asList(2,3,12,15,64),mul.ordinaCrescente(Arrays.asList(15,3,64,2,12)));
		assertEquals(Arrays.asList(0,6,23,45,95),mul.ordinaCrescente(Arrays.asList(0,45,23,95,6)));
	}
	
	@Test
	public void testOrdinaDecrescente() {
		//fail("Not yet implemented");
		System.out.println("Test ordinaDecrescente "+ LocalDateTime.now() );
		assertEquals(Arrays.asList(64,15,12,3,2),mul.ordinaDecrescente(Arrays.asList(15,3,64,2,12)));
		assertEquals(Arrays.asList(95,45,23,6,0),mul.ordinaDecrescente(Arrays.asList(0,45,23,95,6)));
	}

}
