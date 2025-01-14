package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;
import lombok.Getter;

@Getter
public class ActorCombatSoundEffect extends SoundEffect
{
	int actorCombatLevel;

	public ActorCombatSoundEffect(int id, SoundEffectType soundEffectType, int actorCombatLevel)
	{
		super(id, soundEffectType);
		this.actorCombatLevel = actorCombatLevel;
	}
}
