package def.socket_io_client.socketioclient;
/**
	 * Options we can pass to the socket when connecting
	 */
@jsweet.lang.Interface
public abstract class ConnectOpts extends def.js.Object {
    /**
		 * Should we force a new Manager for this connection?
		 * @default false
		 */
    @jsweet.lang.Optional
    public Boolean forceNew;
    /**
		 * Should we multiplex our connection (reuse existing Manager) ?
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean multiplex;
    /**
		 * The path to get our client file from, in the case of the server
		 * serving it
		 * @default '/socket.io'
		 */
    @jsweet.lang.Optional
    public String path;
    /**
		 * Should we allow reconnections?
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean reconnection;
    /**
		 * How many reconnection attempts should we try?
		 * @default Infinity
		 */
    @jsweet.lang.Optional
    public double reconnectionAttempts;
    /**
		 * The time delay in milliseconds between reconnection attempts
		 * @default 1000
		 */
    @jsweet.lang.Optional
    public double reconnectionDelay;
    /**
		 * The max time delay in milliseconds between reconnection attempts
		 * @default 5000
		 */
    @jsweet.lang.Optional
    public double reconnectionDelayMax;
    /**
		 * Used in the exponential backoff jitter when reconnecting
		 * @default 0.5
		 */
    @jsweet.lang.Optional
    public double randomizationFactor;
    /**
		 * The timeout in milliseconds for our connection attempt
		 * @default 20000
		 */
    @jsweet.lang.Optional
    public double timeout;
    /**
		 * Should we automically connect?
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean autoConnect;
    /**
		 * The host that we're connecting to. Set from the URI passed when connecting
		 */
    @jsweet.lang.Optional
    public String host;
    /**
		 * The hostname for our connection. Set from the URI passed when connecting
		 */
    @jsweet.lang.Optional
    public String hostname;
    /**
		 * If this is a secure connection. Set from the URI passed when connecting
		 */
    @jsweet.lang.Optional
    public Boolean secure;
    /**
		 * The port for our connection. Set from the URI passed when connecting
		 */
    @jsweet.lang.Optional
    public String port;
    /**
		 * Any query parameters in our uri. Set from the URI passed when connecting
		 */
    @jsweet.lang.Optional
    public Object query;
    /**
		 * `http.Agent` to use, defaults to `false` (NodeJS only)
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,Boolean> agent;
    /**
		 * Whether the client should try to upgrade the transport from
		 * long-polling to something better.
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean upgrade;
    /**
		 * Forces JSONP for polling transport.
		 */
    @jsweet.lang.Optional
    public Boolean forceJSONP;
    /**
		 * Determines whether to use JSONP when necessary for polling. If
		 * disabled (by settings to false) an error will be emitted (saying
		 * "No transports available") if no other transports are available.
		 * If another transport is available for opening a connection (e.g.
		 * WebSocket) that transport will be used instead.
		 * @default true
		 */
    @jsweet.lang.Optional
    public Boolean jsonp;
    /**
		 * Forces base 64 encoding for polling transport even when XHR2
		 * responseType is available and WebSocket even if the used standard
		 * supports binary.
		 */
    @jsweet.lang.Optional
    public Boolean forceBase64;
    /**
		 * Enables XDomainRequest for IE8 to avoid loading bar flashing with
		 * click sound. default to `false` because XDomainRequest has a flaw
		 * of not sending cookie.
		 * @default false
		 */
    @jsweet.lang.Optional
    public Boolean enablesXDR;
    /**
		 * The param name to use as our timestamp key
		 * @default 't'
		 */
    @jsweet.lang.Optional
    public String timestampParam;
    /**
		 * Whether to add the timestamp with each transport request. Note: this
		 * is ignored if the browser is IE or Android, in which case requests
		 * are always stamped
		 * @default false
		 */
    @jsweet.lang.Optional
    public Boolean timestampRequests;
    /**
		 * A list of transports to try (in order). Engine.io always attempts to
		 * connect directly with the first one, provided the feature detection test
		 * for it passes.
		 * @default ['polling','websocket']
		 */
    @jsweet.lang.Optional
    public String[] transports;
    /**
		 * The port the policy server listens on
		 * @default 843
		 */
    @jsweet.lang.Optional
    public double policyPost;
    /**
		 * If true and if the previous websocket connection to the server succeeded,
		 * the connection attempt will bypass the normal upgrade process and will
		 * initially try websocket. A connection attempt following a transport error
		 * will use the normal upgrade process. It is recommended you turn this on
		 * only when using SSL/TLS connections, or if you know that your network does
		 * not block websockets.
		 * @default false
		 */
    @jsweet.lang.Optional
    public Boolean rememberUpgrade;
    /**
		 * Are we only interested in transports that support binary?
		 */
    @jsweet.lang.Optional
    public Boolean onlyBinaryUpgrades;
    /**
		 * Header options for Node.js client
		 */
    @jsweet.lang.Optional
    public Object extraHeaders;
    /**
		 * (SSL) Certificate, Private key and CA certificates to use for SSL.
		 * Can be used in Node.js client environment to manually specify
		 * certificate information.
		 */
    @jsweet.lang.Optional
    public String pfx;
    /**
		 * (SSL) Private key to use for SSL. Can be used in Node.js client
		 * environment to manually specify certificate information.
		 */
    @jsweet.lang.Optional
    public String key;
    /**
		 * (SSL) A string or passphrase for the private key or pfx. Can be
		 * used in Node.js client environment to manually specify certificate
		 * information.
		 */
    @jsweet.lang.Optional
    public String passphrase;
    /**
		 * (SSL) Public x509 certificate to use. Can be used in Node.js client
		 * environment to manually specify certificate information.
		 */
    @jsweet.lang.Optional
    public String cert;
    /**
		 * (SSL) An authority certificate or array of authority certificates to
		 * check the remote host against.. Can be used in Node.js client
		 * environment to manually specify certificate information.
		 */
    @jsweet.lang.Optional
    public jsweet.util.union.Union<String,String[]> ca;
    /**
		 * (SSL) A string describing the ciphers to use or exclude. Consult the
		 * [cipher format list]
		 * (http://www.openssl.org/docs/apps/ciphers.html#CIPHER_LIST_FORMAT) for
		 * details on the format.. Can be used in Node.js client environment to
		 * manually specify certificate information.
		 */
    @jsweet.lang.Optional
    public String ciphers;
    /**
		 * (SSL) If true, the server certificate is verified against the list of
		 * supplied CAs. An 'error' event is emitted if verification fails.
		 * Verification happens at the connection level, before the HTTP request
		 * is sent. Can be used in Node.js client environment to manually specify
		 * certificate information.
		 */
    @jsweet.lang.Optional
    public Boolean rejectUnauthorized;
}

