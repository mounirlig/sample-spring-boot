package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.AfterClass;
import org.junit.After;
import org.junit.Ignore;



@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
        public void shouldAnswerWithTrue()
        {
        assertTrue( true );
        }

	@Test
        public void shouldAnswerWithTrue2()
        {
        assertTrue( true );
        }

	@Test
        public void shouldAnswerWithTrue3()
        {
        assertTrue( true );
        }

	@Ignore
	@Test
        public void shouldAnswerWithTrue4()
        {
        assertTrue( false );
        }

	@Ignore
	@Test
        public void shouldAnswerWithTrue5()
        {
        assertTrue( false );
	}

}
