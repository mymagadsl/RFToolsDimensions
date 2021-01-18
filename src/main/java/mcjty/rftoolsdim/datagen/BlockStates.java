package mcjty.rftoolsdim.datagen;

import mcjty.lib.datagen.BaseBlockStateProvider;
import mcjty.rftoolsdim.RFToolsDim;
import mcjty.rftoolsdim.modules.dimensionbuilder.DimensionBuilderModule;
import mcjty.rftoolsdim.modules.enscriber.EnscriberModule;
import mcjty.rftoolsdim.modules.workbench.WorkbenchModule;
import net.minecraft.data.DataGenerator;
import net.minecraftforge.common.data.ExistingFileHelper;

public class BlockStates extends BaseBlockStateProvider {

    public BlockStates(DataGenerator gen, ExistingFileHelper exFileHelper) {
        super(gen, RFToolsDim.MODID, exFileHelper);
    }

    @Override
    protected void registerStatesAndModels() {
        orientedBlock(DimensionBuilderModule.DIMENSION_BUILDER.get(), frontBasedModel("dimension_builder", modLoc("block/dimensionbuilder")));
        orientedBlock(WorkbenchModule.WORKBENCH.get(), topBasedModel("dimlet_workbench", modLoc("block/dimletworkbenchtop")));
        orientedBlock(WorkbenchModule.HOLDER.get(), frontBasedModel("knowledge_holder", modLoc("block/knowledge_holder")));
        orientedBlock(EnscriberModule.ENSCRIBER.get(), frontBasedModel("enscriber", modLoc("block/dimensionenscriber")));
    }
}
