/*
 * *****************************************************************************
 * Copyright (C) 2014-2024 Dennis Sheirer
 *
 * This program is free software: you can redistribute it and/or modify
 * it under the terms of the GNU General Public License as published by
 * the Free Software Foundation, either version 3 of the License, or
 * (at your option) any later version.
 *
 * This program is distributed in the hope that it will be useful,
 * but WITHOUT ANY WARRANTY; without even the implied warranty of
 * MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
 * GNU General Public License for more details.
 *
 * You should have received a copy of the GNU General Public License
 * along with this program.  If not, see <http://www.gnu.org/licenses/>
 * ****************************************************************************
 */

// Generated by jextract

package io.github.dsheirer.source.tuner.sdrplay.api.v3_14;

import java.lang.foreign.MemoryLayout;
import java.lang.foreign.MemorySegment;
import java.lang.foreign.SegmentAllocator;
import java.lang.foreign.SegmentScope;
import java.lang.foreign.StructLayout;
import java.lang.invoke.VarHandle;
/**
 * {@snippet :
 * struct {
 *     unsigned char biasTEnable;
 *     sdrplay_api_Rsp2_AmPortSelectT amPortSel;
 *     sdrplay_api_Rsp2_AntennaSelectT antennaSel;
 *     unsigned char rfNotchEnable;
 * };
 * }
 */
public class sdrplay_api_Rsp2TunerParamsT {

    static final StructLayout $struct$LAYOUT = MemoryLayout.structLayout(
        Constants$root.C_CHAR$LAYOUT.withName("biasTEnable"),
        MemoryLayout.paddingLayout(24),
        Constants$root.C_INT$LAYOUT.withName("amPortSel"),
        Constants$root.C_INT$LAYOUT.withName("antennaSel"),
        Constants$root.C_CHAR$LAYOUT.withName("rfNotchEnable"),
        MemoryLayout.paddingLayout(24)
    );
    public static MemoryLayout $LAYOUT() {
        return sdrplay_api_Rsp2TunerParamsT.$struct$LAYOUT;
    }
    static final VarHandle biasTEnable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("biasTEnable"));
    public static VarHandle biasTEnable$VH() {
        return sdrplay_api_Rsp2TunerParamsT.biasTEnable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char biasTEnable;
     * }
     */
    public static byte biasTEnable$get(MemorySegment seg) {
        return (byte)sdrplay_api_Rsp2TunerParamsT.biasTEnable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char biasTEnable;
     * }
     */
    public static void biasTEnable$set(MemorySegment seg, byte x) {
        sdrplay_api_Rsp2TunerParamsT.biasTEnable$VH.set(seg, x);
    }
    public static byte biasTEnable$get(MemorySegment seg, long index) {
        return (byte)sdrplay_api_Rsp2TunerParamsT.biasTEnable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void biasTEnable$set(MemorySegment seg, long index, byte x) {
        sdrplay_api_Rsp2TunerParamsT.biasTEnable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle amPortSel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("amPortSel"));
    public static VarHandle amPortSel$VH() {
        return sdrplay_api_Rsp2TunerParamsT.amPortSel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * sdrplay_api_Rsp2_AmPortSelectT amPortSel;
     * }
     */
    public static int amPortSel$get(MemorySegment seg) {
        return (int)sdrplay_api_Rsp2TunerParamsT.amPortSel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * sdrplay_api_Rsp2_AmPortSelectT amPortSel;
     * }
     */
    public static void amPortSel$set(MemorySegment seg, int x) {
        sdrplay_api_Rsp2TunerParamsT.amPortSel$VH.set(seg, x);
    }
    public static int amPortSel$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_Rsp2TunerParamsT.amPortSel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void amPortSel$set(MemorySegment seg, long index, int x) {
        sdrplay_api_Rsp2TunerParamsT.amPortSel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle antennaSel$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("antennaSel"));
    public static VarHandle antennaSel$VH() {
        return sdrplay_api_Rsp2TunerParamsT.antennaSel$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * sdrplay_api_Rsp2_AntennaSelectT antennaSel;
     * }
     */
    public static int antennaSel$get(MemorySegment seg) {
        return (int)sdrplay_api_Rsp2TunerParamsT.antennaSel$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * sdrplay_api_Rsp2_AntennaSelectT antennaSel;
     * }
     */
    public static void antennaSel$set(MemorySegment seg, int x) {
        sdrplay_api_Rsp2TunerParamsT.antennaSel$VH.set(seg, x);
    }
    public static int antennaSel$get(MemorySegment seg, long index) {
        return (int)sdrplay_api_Rsp2TunerParamsT.antennaSel$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void antennaSel$set(MemorySegment seg, long index, int x) {
        sdrplay_api_Rsp2TunerParamsT.antennaSel$VH.set(seg.asSlice(index*sizeof()), x);
    }
    static final VarHandle rfNotchEnable$VH = $struct$LAYOUT.varHandle(MemoryLayout.PathElement.groupElement("rfNotchEnable"));
    public static VarHandle rfNotchEnable$VH() {
        return sdrplay_api_Rsp2TunerParamsT.rfNotchEnable$VH;
    }
    /**
     * Getter for field:
     * {@snippet :
     * unsigned char rfNotchEnable;
     * }
     */
    public static byte rfNotchEnable$get(MemorySegment seg) {
        return (byte)sdrplay_api_Rsp2TunerParamsT.rfNotchEnable$VH.get(seg);
    }
    /**
     * Setter for field:
     * {@snippet :
     * unsigned char rfNotchEnable;
     * }
     */
    public static void rfNotchEnable$set(MemorySegment seg, byte x) {
        sdrplay_api_Rsp2TunerParamsT.rfNotchEnable$VH.set(seg, x);
    }
    public static byte rfNotchEnable$get(MemorySegment seg, long index) {
        return (byte)sdrplay_api_Rsp2TunerParamsT.rfNotchEnable$VH.get(seg.asSlice(index*sizeof()));
    }
    public static void rfNotchEnable$set(MemorySegment seg, long index, byte x) {
        sdrplay_api_Rsp2TunerParamsT.rfNotchEnable$VH.set(seg.asSlice(index*sizeof()), x);
    }
    public static long sizeof() { return $LAYOUT().byteSize(); }
    public static MemorySegment allocate(SegmentAllocator allocator) { return allocator.allocate($LAYOUT()); }
    public static MemorySegment allocateArray(long len, SegmentAllocator allocator) {
        return allocator.allocate(MemoryLayout.sequenceLayout(len, $LAYOUT()));
    }
    public static MemorySegment ofAddress(MemorySegment addr, SegmentScope scope) { return RuntimeHelper.asArray(addr, $LAYOUT(), 1, scope); }
}


