package com.sun.corba.se.PortableActivationIDL;


/**
* com/sun/corba/se/PortableActivationIDL/ServerAlreadyInstalled.java .
* Generated by the IDL-to-Java compiler (portable), version "3.2"
* from c:/ade/jenkins/workspace/8-2-build-owindows-i586-cygwin/jdk8u41/500/corba/src/share/classes/com/sun/corba/se/PortableActivationIDL/activation.idl
* Wednesday, January 15, 2020 7:02:47 AM UTC
*/

public final class ServerAlreadyInstalled extends org.omg.CORBA.UserException
{
  public String serverId = null;

  public ServerAlreadyInstalled ()
  {
    super(ServerAlreadyInstalledHelper.id());
  } // ctor

  public ServerAlreadyInstalled (String _serverId)
  {
    super(ServerAlreadyInstalledHelper.id());
    serverId = _serverId;
  } // ctor


  public ServerAlreadyInstalled (String $reason, String _serverId)
  {
    super(ServerAlreadyInstalledHelper.id() + "  " + $reason);
    serverId = _serverId;
  } // ctor

} // class ServerAlreadyInstalled
