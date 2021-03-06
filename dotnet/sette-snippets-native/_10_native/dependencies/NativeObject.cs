﻿/*
 * SETTE - Symbolic Execution based Test Tool Evaluator
 *
 * SETTE is a tool to help the evaluation and comparison of symbolic execution based test input
 * generator tools.
 *
 * Budapest University of Technology and Economics (BME)
 *
 * Authors: Lajos Cseppentő <lajos.cseppento@inf.mit.bme.hu>, Zoltán Micskei <micskeiz@mit.bme.hu>
 *
 * Copyright 2014-2016
 *
 * Licensed under the Apache License, Version 2.0 (the "License"); you may not use this file except
 * in compliance with the License. You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software distributed under the
 * License is distributed on an "AS IS" BASIS, WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either
 * express or implied. See the License for the specific language governing permissions and
 * limitations under the License.
 */

using System;
using System.Runtime.InteropServices;

namespace BME.MIT.SETTE.Native.Dependencies
{
    public class NativeObject
    {
        private int x = 0;

        unsafe public void calculate(int a)
        {
            // extern can be only used on static methods, workaround with pointer
            fixed (int* xPtr = &x)
            {
                // call the proper version based on whether the _process_ is 32 or 64-bit
                if (IntPtr.Size == 8)
                {
                    calculate_x64(xPtr, a);
                }
                else
                {
                    calculate_x86(xPtr, a);
                }
            }
        }

        [DllImport("N10_x86.dll", EntryPoint = "NativeObject_calculate", CallingConvention = CallingConvention.Cdecl)]
        unsafe private static extern void calculate_x86(int* x, int a);

        [DllImport("N10_x64.dll", EntryPoint = "NativeObject_calculate", CallingConvention = CallingConvention.Cdecl)]
        unsafe private static extern void calculate_x64(int* x, int a);

        public int getX()
        {
            return x;
        }
    }
}