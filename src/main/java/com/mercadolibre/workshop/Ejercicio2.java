package com.mercadolibre.workshop;

import org.openjdk.jmh.annotations.Benchmark;
import org.openjdk.jmh.annotations.BenchmarkMode;
import org.openjdk.jmh.annotations.Fork;
import org.openjdk.jmh.annotations.Level;
import org.openjdk.jmh.annotations.Mode;
import org.openjdk.jmh.annotations.Scope;
import org.openjdk.jmh.annotations.Setup;
import org.openjdk.jmh.annotations.State;
import org.openjdk.jmh.runner.RunnerException;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class Ejercicio2 {

    public static void main(String[] args) throws IOException, RunnerException {
        org.openjdk.jmh.Main.main(args);
    }

    @State(Scope.Benchmark)
    public static class GlobalState {
        String line;
        String toReplace2 = "0123456789ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz";

        public String readLine() throws IOException {
            ClassLoader classLoader = this.getClass().getClassLoader();
            return new BufferedReader(new FileReader(new File(classLoader.getResource("ejercicio2.txt").getFile()))).readLine();
        }

        @Setup(Level.Invocation)
        public void setUp() throws IOException {
            line = readLine();
        }
    }


    @Fork(value = 2, warmups = 2)
    @Benchmark
    @BenchmarkMode(Mode.AverageTime)
    public void appAverageTimeCalculation(GlobalState globalState) {
        Ejercicio1.resolve(globalState.line, globalState.toReplace2);
    }
}
