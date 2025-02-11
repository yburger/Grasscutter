package emu.grasscutter.server.packet.send;

import emu.grasscutter.net.packet.GenshinPacket;
import emu.grasscutter.net.packet.PacketOpcodes;
import emu.grasscutter.net.proto.SceneUnlockInfoNotifyOuterClass.SceneUnlockInfoNotify;
import emu.grasscutter.net.proto.SceneUnlockInfoOuterClass.SceneUnlockInfo;

public class PacketSceneUnlockInfoNotify extends GenshinPacket {
	
	public PacketSceneUnlockInfoNotify() {
		super(PacketOpcodes.SceneUnlockInfoNotify); // Rename opcode later

		SceneUnlockInfoNotify proto = SceneUnlockInfoNotify.newBuilder()
				.addUnlockInfos(SceneUnlockInfo.newBuilder().setSceneId(1))
				.addUnlockInfos(SceneUnlockInfo.newBuilder().setSceneId(3))
				.addUnlockInfos(SceneUnlockInfo.newBuilder().setSceneId(4))
				.addUnlockInfos(SceneUnlockInfo.newBuilder().setSceneId(5))
				.addUnlockInfos(SceneUnlockInfo.newBuilder().setSceneId(6))
				.addUnlockInfos(SceneUnlockInfo.newBuilder().setSceneId(7))
				.build();
		
		this.setData(proto);
	}
}
