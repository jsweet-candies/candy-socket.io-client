package def.socket_io_client;
@jsweet.lang.Interface
public abstract class SocketIOClientStatic extends def.js.Object {
    /**
	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
	 * 	'io( 'http://localhost/a' );'
	 * 	'io( 'http://localhost/b' );'
	 *
	 * We reuse the existing instance based on the same scheme/port/host, and
	 * we initialize sockets for each namespace. If autoConnect isn't set to
	 * false in the options, then we'll automatically connect
	 * @param uri The uri that we'll connect to, including the namespace, where '/' is the default one (e.g. http://localhost:4000/somenamespace)
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
    native public def.socket_io_client.socketioclient.Socket $apply(String uri, def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
	 * Auto-connects to the window location and defalt namespace.
	 * E.g. window.protocol + '//' + window.host + ':80/'
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
    native public def.socket_io_client.socketioclient.Socket $apply(def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
	 * @see the default constructor (io(uri, opts))
	 */
    native public def.socket_io_client.socketioclient.Socket connect(String uri, def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
	 * @see the default constructor (io(opts))
	 */
    native public def.socket_io_client.socketioclient.Socket connect(def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
	 * The socket.io protocol revision number this client works with
	 * @default 4
	 */
    public double protocol;
    /**
	 * Socket constructor - exposed for the standalone build
	 */
    public def.socket_io_client.socketioclient.Socket Socket;
    /**
	 * Manager constructor - exposed for the standalone build
	 */
    public def.socket_io_client.socketioclient.ManagerStatic Manager;
    /**
	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
	 * 	'io( 'http://localhost/a' );'
	 * 	'io( 'http://localhost/b' );'
	 *
	 * We reuse the existing instance based on the same scheme/port/host, and
	 * we initialize sockets for each namespace. If autoConnect isn't set to
	 * false in the options, then we'll automatically connect
	 * @param uri The uri that we'll connect to, including the namespace, where '/' is the default one (e.g. http://localhost:4000/somenamespace)
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
    native public def.socket_io_client.socketioclient.Socket $apply(String uri);
    /**
	 * Auto-connects to the window location and defalt namespace.
	 * E.g. window.protocol + '//' + window.host + ':80/'
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
    native public def.socket_io_client.socketioclient.Socket $apply();
    /**
	 * @see the default constructor (io(uri, opts))
	 */
    native public def.socket_io_client.socketioclient.Socket connect(String uri);
    /**
	 * @see the default constructor (io(opts))
	 */
    native public def.socket_io_client.socketioclient.Socket connect();
    /**
		 * Creates a new Manager
		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
		 * @param opts Any connection options that we want to use (and pass to engine.io)
		 * @return A Manager
		 */
    native public def.socket_io_client.socketioclient.Manager Manager(java.lang.String uri, def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
		 * Creates a new Manager with the default URI (window host)
		 * @param opts Any connection options that we want to use (and pass to engine.io)
		 */
    native public def.socket_io_client.socketioclient.Manager Manager(def.socket_io_client.socketioclient.ConnectOpts opts);
    /**
		 * Creates a new Manager
		 * @param uri The URI that we're connecting to (e.g. http://localhost:4000)
		 * @param opts Any connection options that we want to use (and pass to engine.io)
		 * @return A Manager
		 */
    native public def.socket_io_client.socketioclient.Manager Manager(java.lang.String uri);
}

