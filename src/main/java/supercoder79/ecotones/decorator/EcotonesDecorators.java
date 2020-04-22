package supercoder79.ecotones.decorator;

import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import net.minecraft.world.gen.decorator.Decorator;
import net.minecraft.world.gen.decorator.NopeDecoratorConfig;

public class EcotonesDecorators {
    public static Decorator<ShrubDecoratorConfig> SHRUB_PLACEMENT_DECORATOR;
    public static Decorator<NopeDecoratorConfig> DRAINAGE_DECORATOR;

    public static void init() {
        SHRUB_PLACEMENT_DECORATOR = Registry.register(Registry.DECORATOR, new Identifier("ecotones", "shrub_placement_decorator"), new AnalyticShrubPlacementDecorator(ShrubDecoratorConfig::deserialize));
        DRAINAGE_DECORATOR = Registry.register(Registry.DECORATOR, new Identifier("ecotones", "drainage_decorator"), new DrainageSurfaceDecorator(NopeDecoratorConfig::deserialize));
    }
}
