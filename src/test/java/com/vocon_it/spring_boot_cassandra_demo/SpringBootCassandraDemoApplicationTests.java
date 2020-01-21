package com.vocon_it.spring_boot_cassandra_demo;

//import com.datastax.driver.core.Cluster;
//import com.datastax.driver.core.Session;
//import org.cassandraunit.CQLDataLoader;
//import org.cassandraunit.dataset.cql.ClassPathCQLDataSet;
//import org.cassandraunit.spring.CassandraDataSet;
//import org.cassandraunit.spring.CassandraUnitTestExecutionListener;
//import org.cassandraunit.spring.EmbeddedCassandra;
//import org.cassandraunit.spring.CassandraUnit;
//import org.cassandraunit.utils.EmbeddedCassandraServerHelper;
//import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;
//import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.TestExecutionListeners;
//import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
//
//import static org.springframework.test.context.TestExecutionListeners.MergeMode.MERGE_WITH_DEFAULTS;


@SpringBootTest
//@RunWith(SpringJUnit4ClassRunner.class)
//@TestExecutionListeners(
//		listeners = CassandraUnitTestExecutionListener.class,
//		mergeMode = MERGE_WITH_DEFAULTS
//)
//@CassandraUnit
//@CassandraDataSet(value = { "simple.cql" })
//@EmbeddedCassandra( configuration = "cassandra-embedded-config.yaml" )
class SpringBootCassandraDemoApplicationTests {

//	@BeforeClass
//	public static void before() throws Exception
//	{
//		EmbeddedCassandraServerHelper.startEmbeddedCassandra(20000L);
//		Cluster cluster = new Cluster.Builder().addContactPoints("127.0.0.1").withPort(9042).build();
//		Session session = cluster.connect();
//		CQLDataLoader cqlDataLoader = new CQLDataLoader(session);
//		cqlDataLoader.load(new ClassPathCQLDataSet("cql/schema.sql", true, true, "keyspace"));
//	}

	@Test
	void contextLoads() {
	}

//	@Test
//	public void should_have_started_and_execute_cql_script() throws Exception {
//		CqlSession session = EmbeddedCassandraServerHelper.getSession();
//
//		ResultSet result = session.execute("select * from mytable WHERE id='myKey01'");
//		assertThat(result.iterator().next().getString("value"), is("myValue01"));
//	}


}
