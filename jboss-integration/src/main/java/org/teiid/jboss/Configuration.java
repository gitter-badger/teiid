/*
 * JBoss, Home of Professional Open Source.
 * Copyright 2011, Red Hat, Inc., and individual contributors
 * as indicated by the @author tags. See the copyright.txt file in the
 * distribution for a full listing of individual contributors.
 *
 * This is free software; you can redistribute it and/or modify it
 * under the terms of the GNU Lesser General Public License as
 * published by the Free Software Foundation; either version 2.1 of
 * the License, or (at your option) any later version.
 *
 * This software is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE. See the GNU
 * Lesser General Public License for more details.
 *
 * You should have received a copy of the GNU Lesser General Public
 * License along with this software; if not, write to the Free
 * Software Foundation, Inc., 51 Franklin St, Fifth Floor, Boston, MA
 * 02110-1301 USA, or see the FSF site: http://www.fsf.org.
 */
package org.teiid.jboss;

import static org.jboss.as.controller.descriptions.ModelDescriptionConstants.*;

import org.jboss.dmr.ModelNode;
import org.jboss.dmr.ModelType;

class Configuration {
	public static final String BUFFER_SERVICE = "buffer-service";//$NON-NLS-1$
	public static final String RESULTSET_CACHE = "resultset-cache";//$NON-NLS-1$
	public static final String PREPAREDPLAN_CACHE = "preparedplan-cache";//$NON-NLS-1$	
	public static final String CACHE_FACORY = "distributed-cache-factory";//$NON-NLS-1$
	public static final String QUERY_ENGINE = "query-engine";//$NON-NLS-1$
	public static final String JDBC = "jdbc";//$NON-NLS-1$
	public static final String ODBC = "odbc"; //$NON-NLS-1$
	public static final String TRANSLATOR = "translator"; //$NON-NLS-1$
	
	// Query-ENGINE
	public static final String ASYNC_THREAD_GROUP = "async-thread-group";//$NON-NLS-1$
	public static final String MAX_THREADS = "max-threads";//$NON-NLS-1$
	public static final String MAX_ACTIVE_PLANS = "max-active-plans";//$NON-NLS-1$
	public static final String USER_REQUEST_SOURCE_CONCURRENCY = "userRequestSourceConcurrency";//$NON-NLS-1$
	public static final String TIME_SLICE_IN_MILLI = "time-slice-in-millseconds";//$NON-NLS-1$
	public static final String MAX_ROWS_FETCH_SIZE = "max-row-fetch-size";//$NON-NLS-1$
	public static final String LOB_CHUNK_SIZE_IN_KB = "lob-chunk-size-in-kb";//$NON-NLS-1$
	public static final String USE_DATA_ROLES = "use-dataroles";//$NON-NLS-1$
	public static final String ALLOW_CREATE_TEMPORY_TABLES_BY_DEFAULT = "allow-creation-of-temporary-tables";//$NON-NLS-1$
	public static final String ALLOW_FUNCTION_CALLS_BY_DEFAULT = "allow-function-calls";//$NON-NLS-1$
	public static final String QUERY_THRESHOLD_IN_SECS = "query-threshold-in-seconds";//$NON-NLS-1$
	public static final String MAX_SOURCE_ROWS = "max-source-rows-allowed";//$NON-NLS-1$
	public static final String EXCEPTION_ON_MAX_SOURCE_ROWS = "exception-on-max-source-rows";//$NON-NLS-1$
	public static final String MAX_ODBC_LOB_SIZE_ALLOWED = "max-odbc-lob-size-allowed";//$NON-NLS-1$
	public static final String EVENT_DISTRIBUTOR_NAME = "event-distributor-name";//$NON-NLS-1$
	public static final String DETECTING_CHANGE_EVENTS = "detect-change-events";//$NON-NLS-1$
	public static final String SECURITY_DOMAIN = "security-domain";//$NON-NLS-1$
	public static final String MAX_SESSIONS_ALLOWED = "max-sessions-allowed";//$NON-NLS-1$
	public static final String SESSION_EXPIRATION_TIME_LIMIT = "sessions-expiration-timelimit";//$NON-NLS-1$
	public static final String ALLOW_ENV_FUNCTION = "allow-env-function";//$NON-NLS-1$
	
	public static final String USE_DISK = "use-disk";//$NON-NLS-1$
	public static final String PROCESSOR_BATCH_SIZE = "processor-batch-size";//$NON-NLS-1$
	public static final String CONNECTOR_BATCH_SIZE = "connector-batch-size";//$NON-NLS-1$
	public static final String MAX_RESERVE_BATCH_COLUMNS = "maxReserveBatchColumns";//$NON-NLS-1$
	public static final String MAX_PROCESSING_BATCH_COLUMNS = "maxProcessingBatchesColumns";//$NON-NLS-1$
	public static final String MAX_FILE_SIZE = "maxFileSize";//$NON-NLS-1$
	public static final String MAX_BUFFER_SPACE = "maxBufferSpace";//$NON-NLS-1$
	public static final String MAX_OPEN_FILES = "maxOpenFiles";//$NON-NLS-1$
		
	//cache-config
	public static final String MAX_ENTRIES = "maxEntries";//$NON-NLS-1$
	public static final String MAX_AGE_IN_SECS = "maxAgeInSeconds";//$NON-NLS-1$
	public static final String MAX_STALENESS = "maxStaleness";//$NON-NLS-1$
	public static final String CACHE_TYPE = "type";//$NON-NLS-1$
	public static final String CACHE_LOCATION= "location";//$NON-NLS-1$
	
	// cache-factory
	public static final String  CACHE_SERVICE_JNDI_NAME = "cache-service-jndi-name";//$NON-NLS-1$
	public static final String  RESULTSET_CACHE_NAME = "resultsetCacheName";//$NON-NLS-1$
	public static final String  CLASS = "class";//$NON-NLS-1$
	
	//socket config
	public static final String MAX_SOCKET_THREAD_SIZE = "maxSocketThreads";//$NON-NLS-1$
	public static final String IN_BUFFER_SIZE = "inputBufferSize";//$NON-NLS-1$
	public static final String OUT_BUFFER_SIZE = "outputBufferSize";//$NON-NLS-1$
	public static final String SOCKET_BINDING = "socket-binding";//$NON-NLS-1$
	public static final String SOCKET_ENABLED = "enabled";//$NON-NLS-1$
	public static final String SSL_MODE = "mode";//$NON-NLS-1$
	public static final String KEY_STORE_FILE = "keystoreFilename";//$NON-NLS-1$
	public static final String KEY_STORE_PASSWD = "keystorePassword";//$NON-NLS-1$
	public static final String KEY_STORE_TYPE = "keystoreType";//$NON-NLS-1$
	public static final String SSL_PROTOCOL = "sslProtocol";//$NON-NLS-1$
	public static final String KEY_MANAGEMENT_ALG = "keymanagementAlgorithm";//$NON-NLS-1$
	public static final String TRUST_FILE = "truststoreFilename";//$NON-NLS-1$
	public static final String TRUST_PASSWD = "truststorePassword";//$NON-NLS-1$
	public static final String AUTH_MODE = "authenticationMode";//$NON-NLS-1$
	public static final String SSL = "ssl";//$NON-NLS-1$
	
	public static final String TRANSLATOR_NAME = "name";//$NON-NLS-1$
	public static final String TRANSLATOR_MODULE = "module";//$NON-NLS-1$
	
	public static final String DESC = ".describe"; //$NON-NLS-1$
	static void addAttribute(ModelNode node, String name, String type, String description, ModelType dataType, boolean required, String defaultValue) {
		node.get(type, name, TYPE).set(dataType);
        node.get(type, name, DESCRIPTION).set(description);
        node.get(type, name, REQUIRED).set(required);
        node.get(type, name, MAX_OCCURS).set(1);
        if (defaultValue != null) {
        	if (ModelType.INT.equals(dataType)) {
        		node.get(type, name, DEFAULT).set(Integer.parseInt(defaultValue));
        	}
        	else if (ModelType.BOOLEAN.equals(dataType)) {
        		node.get(type, name, DEFAULT).set(Boolean.parseBoolean(defaultValue));
        	}
        	else {
        		node.get(type, name, DEFAULT).set(defaultValue);
        	}
        }
        //TODO: add "allowed" values
    }	
}


