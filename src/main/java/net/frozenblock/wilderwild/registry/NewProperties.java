package net.frozenblock.wilderwild.registry;

import net.frozenblock.wilderwild.block.entity.SculkEchoerPhase;
import net.minecraft.state.property.BooleanProperty;
import net.minecraft.state.property.EnumProperty;
import net.minecraft.state.property.Properties;

public class NewProperties extends Properties {
    public static final EnumProperty<SculkEchoerPhase> SCULK_ECHOER_PHASE = EnumProperty.of("sculk_echoer_phase", SculkEchoerPhase.class);
    public static final BooleanProperty ECHOING = BooleanProperty.of("echoing");
}