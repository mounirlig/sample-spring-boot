package com.example;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DemoApplicationTests {

	@Test
	public void contextLoads() {
	}

	@Test
        public void shouldAnswerWithTrue()
        {
	logger.error("Starting App");
        assertTrue( true );
	logger.error("Closing App");
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

	@Test
        public void shouldAnswerWithTrue4()
        {
        assertTrue( false );
        }

	@Test
        public void shouldAnswerWithTrue5()
        {
        assertTrue( false );
        }


        @BeforeClass public static void initialize() {
        logger.error("Starting Tests");
        }

        @After public void ending() {
        logger.error("ending tests");
        }



}
