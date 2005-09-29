package ome.util.utests;

import ome.util.builders.PojoOptions;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;

import junit.framework.TestCase;

public class PojoOptionsTest extends TestCase {

	private static Log log = LogFactory.getLog(PojoOptionsTest.class);
	
	PojoOptions ob;
	
	protected void setUp() throws Exception {
		ob=new PojoOptions();
	}
	
	public void testDefaults(){
		log.info(ob.map());
	}
	
	public void testAllMethods(){
		log.info(
		ob.allAnnotations()
		.annotationsFor(new Integer(1))
		.noAnnotations()
		.exp(new Integer(3))
		.allExps()
		.noLeaves()
		.map()
		);
	}
	
}
