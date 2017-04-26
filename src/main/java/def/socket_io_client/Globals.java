package def.socket_io_client;

/**
 * This class holds all the global functions and variables of the
 * def.socket_io_client package.
 */
public final class Globals {
	private Globals() {
	}

	@jsweet.lang.Module("socket.io-client")
	public static SocketIOClientStatic io;
	@jsweet.lang.Module("socket.io-client")
	public static SocketIOClientStatic socket_io_client;

	/**
	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
	 * 'io( 'http://localhost/a' );' 'io( 'http://localhost/b' );'
	 *
	 * We reuse the existing instance based on the same scheme/port/host, and we
	 * initialize sockets for each namespace. If autoConnect isn't set to false
	 * in the options, then we'll automatically connect
	 * 
	 * @param uri
	 *            The uri that we'll connect to, including the namespace, where
	 *            '/' is the default one (e.g.
	 *            http://localhost:4000/somenamespace)
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket io(java.lang.String uri,
			def.socket_io_client.socketioclient.ConnectOpts opts);

	/**
	 * Auto-connects to the window location and defalt namespace. E.g.
	 * window.protocol + '//' + window.host + ':80/'
	 * 
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket io(
			def.socket_io_client.socketioclient.ConnectOpts opts);

	/**
	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
	 * 'io( 'http://localhost/a' );' 'io( 'http://localhost/b' );'
	 *
	 * We reuse the existing instance based on the same scheme/port/host, and we
	 * initialize sockets for each namespace. If autoConnect isn't set to false
	 * in the options, then we'll automatically connect
	 * 
	 * @param uri
	 *            The uri that we'll connect to, including the namespace, where
	 *            '/' is the default one (e.g.
	 *            http://localhost:4000/somenamespace)
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket io(java.lang.String uri);

	/**
	 * Auto-connects to the window location and defalt namespace. E.g.
	 * window.protocol + '//' + window.host + ':80/'
	 * 
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket io();

	/**
	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
	 * 'io( 'http://localhost/a' );' 'io( 'http://localhost/b' );'
	 *
	 * We reuse the existing instance based on the same scheme/port/host, and we
	 * initialize sockets for each namespace. If autoConnect isn't set to false
	 * in the options, then we'll automatically connect
	 * 
	 * @param uri
	 *            The uri that we'll connect to, including the namespace, where
	 *            '/' is the default one (e.g.
	 *            http://localhost:4000/somenamespace)
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket socket_io_client(java.lang.String uri,
			def.socket_io_client.socketioclient.ConnectOpts opts);

	/**
	 * Auto-connects to the window location and defalt namespace. E.g.
	 * window.protocol + '//' + window.host + ':80/'
	 * 
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket socket_io_client(
			def.socket_io_client.socketioclient.ConnectOpts opts);

	/**
	 * Looks up an existing 'Manager' for multiplexing. If the user summons:
	 * 'io( 'http://localhost/a' );' 'io( 'http://localhost/b' );'
	 *
	 * We reuse the existing instance based on the same scheme/port/host, and we
	 * initialize sockets for each namespace. If autoConnect isn't set to false
	 * in the options, then we'll automatically connect
	 * 
	 * @param uri
	 *            The uri that we'll connect to, including the namespace, where
	 *            '/' is the default one (e.g.
	 *            http://localhost:4000/somenamespace)
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket socket_io_client(java.lang.String uri);

	/**
	 * Auto-connects to the window location and defalt namespace. E.g.
	 * window.protocol + '//' + window.host + ':80/'
	 * 
	 * @opts Any connect options that we want to pass along
	 * @return A Socket object
	 */
	@jsweet.lang.Module("socket.io-client")
	native public static def.socket_io_client.socketioclient.Socket socket_io_client();
}
