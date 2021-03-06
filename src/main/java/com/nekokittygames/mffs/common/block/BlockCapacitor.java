/*  
    Copyright (C) 2012 Thunderdark

    This program is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    This program is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with this program.  If not, see <http://www.gnu.org/licenses/>.
    
    Contributors:
    Thunderdark - initial implementation
 */
package com.nekokittygames.mffs.common.block;

import com.nekokittygames.mffs.common.ModularForceFieldSystem;
import com.nekokittygames.mffs.common.tileentity.TileEntityCapacitor;
import com.nekokittygames.mffs.libs.LibBlockNames;
import com.nekokittygames.mffs.libs.LibMisc;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.world.World;

public class BlockCapacitor extends BlockMFFSBase {
	public BlockCapacitor() {
		super();
		setUnlocalizedName( LibMisc.UNLOCALIZED_PREFIX+ LibBlockNames.CAPACITOR);
		setRegistryName(LibBlockNames.CAPACITOR);
	}



	@Override
	public TileEntity createNewTileEntity(World world,int meta) {
		return new TileEntityCapacitor();
	}

}
