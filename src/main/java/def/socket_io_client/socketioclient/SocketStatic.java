package def.socket_io_client.socketioclient;
/**
	 * The Socket static interface
	 */
@jsweet.lang.Interface
public abstract class SocketStatic extends def.js.Object {
    /**
		 * Creates a new Socket, used for communicating with a specific namespace
		 * @param io The Manager that's controlling this socket
		 * @param nsp The namespace that this socket is for (@default '/')
		 * @return A new Socket
		 */
    native public Socket apply(def.socket_io_client.socketioclient.Manager io, String nsp);
    /**
		 * Creates a new Socket, used for communicating with a specific namespace
		 * @param io The Manager that's controlling this socket
		 * @param nsp The namespace that this socket is for (@default '/')
		 * @return A new Socket
		 */
    public SocketStatic(String url, Object opts){}
    protected SocketStatic(){}
}

