package com.brooklyn.notificationmessages;

import net.runelite.client.RuneLite;
import net.runelite.client.externalplugins.ExternalPluginManager;

public class NotificationMessagesPluginTest
{
	public static void main(String[] args) throws Exception
	{
		ExternalPluginManager.loadBuiltin(NotificationMessagesPlugin.class);
		RuneLite.main(args);
	}
}