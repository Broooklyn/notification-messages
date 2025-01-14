package com.brooklyn.annoyancemute.soundeffects;

import com.brooklyn.annoyancemute.SoundEffectType;
import lombok.Getter;

@Getter
public class AnimationSoundEffect extends SoundEffect
{
	int animationID;

	public AnimationSoundEffect(int id, SoundEffectType soundEffectType, int animationID)
	{
		super(id, soundEffectType);
		this.animationID = animationID;
	}
}
