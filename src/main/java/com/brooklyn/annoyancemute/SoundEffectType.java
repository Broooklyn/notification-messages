package com.brooklyn.annoyancemute;


import lombok.Getter;
import lombok.RequiredArgsConstructor;

@Getter
@RequiredArgsConstructor
public enum SoundEffectType
{
	EITHER("Either", 0),
	SOUND_EFFECT("Sound Effect", 1),
	AREA_SOUND_EFFECT("Area Sound Effect", 2),

	AMBIENT("Ambient", 3);

	private final String name;
	private final int type;

	@Override
	public String toString()
	{
		return name;
	}
}