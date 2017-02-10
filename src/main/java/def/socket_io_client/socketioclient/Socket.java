package def.socket_io_client.socketioclient;
/**
	 * The Socket that we use to connect to a Namespace on the server
	 */
@jsweet.lang.Interface
public abstract class Socket extends Emitter {
    /**
		 * The Manager that's controller this socket
		 */
    public def.socket_io_client.socketioclient.Manager io;
    /**
		 * The namespace that this socket is for
		 * @default '/'
		 */
    public String nsp;
    /**
		 * The ID of the socket; matches the server ID and is set when we're connected, and cleared
		 * when we're disconnected
		 */
    public String id;
    /**
		 * Are we currently connected?
		 * @default false
		 */
    public Boolean connected;
    /**
		 * Are we currently disconnected?
		 * @default true
		 */
    public Boolean disconnected;
    /**
		 * Opens our socket so that it connects. If the 'autoConnect' option for io is
		 * true (default), then this is called automatically when the Socket is created
		 */
    native public Socket open();
    /**
		 * @see open();
		 */
    native public Socket connect();
    /**
		 * Sends a 'message' event
		 * @param args Any optional arguments that we want to send
		 * @see emit
		 * @return This Socket
		 */
    native public Socket send(Object... args);
    /**
		 * An override of the base emit. If the event is one of:
		 * 	connect
		 * 	connect_error
		 * 	connect_timeout
		 * 	connecting
		 * 	disconnect
		 * 	error
		 * 	reconnect
		 * 	reconnect_attempt
		 * 	reconnect_failed
		 * 	reconnect_error
		 * 	reconnecting
		 * 	ping
		 * 	pong
		 * then the event is emitted normally. Otherwise, if we're connected, the
		 * event is sent. Otherwise, it's buffered.
		 *
		 * If the last argument is a function, then it will be called
		 * as an 'ack' when the response is received. The parameter(s) of the
		 * ack will be whatever data is returned from the event
		 * @param event The event that we're emitting
		 * @param args Optional arguments to send with the event
		 * @return This Socket
		 */
    native public Socket emit(String event, Object... args);
    /**
		 * Disconnects the socket manually
		 * @return This Socket
		 */
    native public Socket close();
    /**
		 * @see close()
		 */
    native public Socket disconnect();
    /**
		* Sets the compress flag.
		* @param compress If `true`, compresses the sending data
		* @return this Socket
		*/
    native public Socket compress(Boolean compress);
}

