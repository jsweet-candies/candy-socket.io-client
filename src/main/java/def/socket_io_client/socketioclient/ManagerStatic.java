package def.socket_io_client.socketioclient;
/**
	 * The Manager static interface
	 */
@jsweet.lang.Interface
public abstract class ManagerStatic extends def.js.Object {
    /**
		 * Creates a new Manager
		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
		 * @param opts Any connection options that we want to use (and pass to engine.io)
		 * @return A Manager
		 */
    native public def.socket_io_client.socketioclient.Manager apply(String uri, def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
		 * Creates a new Manager with the default URI (window host)
		 * @param opts Any connection options that we want to use (and pass to engine.io)
		 */
    native public def.socket_io_client.socketioclient.Manager apply(def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
		 * @see default constructor
		 */
    public ManagerStatic(String uri, def.socket_io_client.socketioclient.ConnectOpts opts){}
    /**
		 * @see default constructor
		 */
    public ManagerStatic(def.socket_io_client.socketioclient.ConnectOpts opts){}
    /**
		 * Creates a new Manager
		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
		 * @param opts Any connection options that we want to use (and pass to engine.io)
		 * @return A Manager
		 */
    native public def.socket_io_client.socketioclient.Manager apply(String uri);
    /**
		 * @see default constructor
		 */
    public ManagerStatic(String uri){}
    protected ManagerStatic(){}
}

