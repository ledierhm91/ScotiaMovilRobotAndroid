/*
 * Classname: Suite  
 * Version information: 1.0
 * Date: September 17 2018 
 * Copyright notice
 */

package suites;

import static org.junit.Assert.*;
import org.junit.Test;

import _framework.Config;
import _framework.Frmwrk;


public class ASPrincipalPaquete{	
	Config stgs = new Config();			
		
	@Test
	public void execute() throws Exception
	{try
		{
			
			}		
	catch(Exception ex) 	
	{	stgs.terminarSesion();
		Frmwrk.cerrarConexionBD();
	    System.out.println(Frmwrk.logError(ex));	    
	    fail("Verificar el stack trace en la Consola");}	
	}
	}
	