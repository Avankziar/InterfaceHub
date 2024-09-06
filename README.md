# InterfaceHub

A plugin, which provides standarts interface for minecraft plugin to plugin communication.

It can function on Spigot/Paper/Bungee/Velocity!
IFH has a <b>Wiki in [English](https://github.com/Avankziar/InterfaceHub/wiki/ENG-Home) or [German](https://github.com/Avankziar/InterfaceHub/wiki/GER-Home)</b>

# How to Install
To install InterfaceHub (IFH), proceed as follows:
- Download the Jar file.
- Copy the jar file into the plugins folder on all servers.
- Restart all servers.
- Finish

# For Developer
## Integration
You can integrate IFH with the jar file or you can call maven dependency:

```
<repository>
    <id>github</id>
	<name>GitHub Avankziar Apache Maven Packages</name>
    <url>https://maven.pkg.github.com/Avankziar/InterfaceHub</url>
</repository>
	    
<dependency>
  <groupId>me.avankziar</groupId>
  <artifactId>interfacehub</artifactId>
  <version>VERSION</version>
</dependency>
```
Version can be found <b>[here](https://github.com/Avankziar/InterfaceHub/packages/2204307)</b>!

# Integrated Possible Dependency
- adventure-platform-bukkit
- adventure-text-minimessage
- boosted-yaml
- mysql-connector-j
- sqlite-jdbc