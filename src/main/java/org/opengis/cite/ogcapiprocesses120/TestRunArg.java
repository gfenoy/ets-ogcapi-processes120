package org.opengis.cite.ogcapiprocesses120;

/**
 * An enumerated type defining all recognized test run arguments.
 */
public enum TestRunArg {

    /**
     * An absolute URI that refers to a representation of the test subject or metadata about it.
     */
    IUT,

    /**
     * The number of collections to test (a value less or equal to 0 means all collections).
     */
    NOOFCOLLECTIONS,
	
	/**
	 * The id of the echo process.
	 */
	ECHOPROCESSID, 	
	
	/**
	 * Limit of processes to be tested against the OGC Process Description Conformance Class.
	 */
	PROCESSTESTLIMIT,

	/**
	 * The URL to the application package to deploy.
	 */
	URLAPPPKG, 	
    
    /**
     * Use local OpenAPI schema.
     */
    USELOCALSCHEMA;

    @Override
    public String toString() {
        return name().toLowerCase();
    }
}
