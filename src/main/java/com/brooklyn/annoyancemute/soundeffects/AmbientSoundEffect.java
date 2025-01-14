package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;
import lombok.Getter;

@Getter
public class AmbientSoundEffect extends SoundEffect
{
	int[] backgroundSoundEffects;

	public AmbientSoundEffect(int id, SoundEffectType soundEffectType)
	{
		super(id, soundEffectType);
		this.backgroundSoundEffects = new int[]{};
	}

	public AmbientSoundEffect(int id, SoundEffectType soundEffectType, int[] backgroundSoundEffects)
	{
		super(id, soundEffectType);
		this.backgroundSoundEffects = backgroundSoundEffects;
	}
}
