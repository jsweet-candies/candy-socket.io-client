package def.socket_io_client.socketioclient;
/**
	 * The Manager class handles all the Namespaces and Sockets that we're using
	 */
@jsweet.lang.Interface
public abstract class Manager extends Emitter {
    /**
		 * All the namespaces currently controlled by this Manager, and the Sockets
		 * that we're using to communicate with them
		 */
    public Nsps nsps;
    /**
		 * The connect options that we used when creating this Manager
		 */
    public def.socket_io_client.socketioclient.ConnectOpts opts;
    /**
		 * The state of the Manager. Either 'closed', 'opening', or 'open'
		 */
    public String readyState;
    /**
		 * The URI that this manager is for (host + port), e.g. 'http://localhost:4000'
		 */
    public String uri;
    /**
		 * The currently connected sockets
		 */
    public Socket[] connecting;
    /**
		 * If we should auto connect (also used when creating Sockets). Set via the
		 * opts object
		 */
    public Boolean autoConnect;
    /**
		 * Gets if we should reconnect automatically
		 * @default true
		 */
    native public Boolean reconnection();
    /**
		 * Sets if we should reconnect automatically
		 * @param v True if we should reconnect automatically, false otherwise
		 * @default true
		 * @return This Manager
		 */
    native public Manager reconnection(Boolean v);
    /**
		 * Gets the number of reconnection attempts we should try before giving up
		 * @default Infinity
		 */
    native public double reconnectionAttempts();
    /**
		 * Sets the number of reconnection attempts we should try before giving up
		 * @param v The number of attempts we should do before giving up
		 * @default Infinity
		 * @return This Manager
		 */
    native public Manager reconnectionAttempts(double v);
    /**
		 * Gets the delay in milliseconds between each reconnection attempt
		 * @default 1000
		 */
    native public double reconnectionDelay();
    /**
		 * Sets the delay in milliseconds between each reconnection attempt
		 * @param v The delay in milliseconds
		 * @default 1000
		 * @return This Manager
		 */
    native public Manager reconnectionDelay(double v);
    /**
		 * Gets the max reconnection delay in milliseconds between each reconnection
		 * attempt
		 * @default 5000
		 */
    native public double reconnectionDelayMax();
    /**
		 * Sets the max reconnection delay in milliseconds between each reconnection
		 * attempt
		 * @param v The max reconnection dleay in milliseconds
		 * @return This Manager
		 */
    native public Manager reconnectionDelayMax(double v);
    /**
		 * Gets the randomisation factor used in the exponential backoff jitter
		 * when reconnecting
		 * @default 0.5
		 */
    native public double randomizationFactor();
    /**
		 * Sets the randomisation factor used in the exponential backoff jitter
		 * when reconnecting
		 * @param The reconnection randomisation factor
		 * @default 0.5
		 * @return This Manager
		 */
    native public Manager randomizationFactor(double v);
    /**
		 * Gets the timeout in milliseconds for our connection attempts
		 * @default 20000
		 */
    native public double timeout();
    /**
		 * Sets the timeout in milliseconds for our connection attempts
		 * @param The connection timeout milliseconds
		 * @return This Manager
		 */
    native public Manager timeout(double v);
    /**
		 * Sets the current transport socket and opens our connection
		 * @param fn An optional callback to call when our socket has either opened, or
		 * failed. It can take one optional parameter of type Error
		 * @return This Manager
		 */
    native public Manager open(java.util.function.Consumer<Object> fn);
    /**
		 * @see open( fn );
		 */
    native public Manager connect(java.util.function.Consumer<Object> fn);
    /**
		 * Creates a new Socket for the given namespace
		 * @param nsp The namespace that this Socket is for
		 * @return A new Socket, or if one has already been created for this namespace,
		 * an existing one
		 */
    native public Socket socket(String nsp);
    /** This is an automatically generated object type (see the source definition). */
    @jsweet.lang.ObjectType
    public static class Nsps extends def.js.Object {
        native public Socket $get(String namespace);
    }
    /**
		 * Sets the current transport socket and opens our connection
		 * @param fn An optional callback to call when our socket has either opened, or
		 * failed. It can take one optional parameter of type Error
		 * @return This Manager
		 */
    native public Manager open();
    /**
		 * @see open( fn );
		 */
    native public Manager connect();
    /**
		 * Sets the current transport socket and opens our connection
		 * @param fn An optional callback to call when our socket has either opened, or
		 * failed. It can take one optional parameter of type Error
		 * @return This Manager
		 */
    native public Manager open(java.lang.Runnable fn);
    /**
		 * @see open( fn );
		 */
    native public Manager connect(java.lang.Runnable fn);
}

