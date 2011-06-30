/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.googlecode.gwtnes.client.halfnes.mappers;

import com.googlecode.gwtnes.client.halfnes.Utils;

/**
 *
 * @author Andrew
 */
public class Mapper87 extends Mapper {

    @Override
    public void loadrom() throws BadMapperException {
        //needs to be in every mapper. Fill with initial cfg
        super.loadrom();
        for (int i = 0; i < 32; ++i) {
            prg_map[i] = (1024 * i) & (prgsize - 1);
        }
        for (int i = 0; i < 8; ++i) {
            chr_map[i] = (1024 * i) & (chrsize - 1);
        }
    }

    @Override
    public void cartWrite(final int addr, final int data) {
        if (addr >= 0x6000 && addr < 0x8000) {
            //remap CHR bank
            int bit0 = Utils.getbitI(data,1);
            int bit1 = Utils.getbitI(data,0);
            for (int i = 0; i < 8; ++i) {
                chr_map[i] = (1024 * (i + 8 * ((bit1 << 1) + bit0))) & (chrsize - 1);
            }
        } else {
            super.cartWrite(addr, data);
        }
    }
}
