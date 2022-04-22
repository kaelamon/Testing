package Lesson10_11.Homework3;

interface Fish  { int getNumberOfScales(); }
interface Piano { double getNumberOfScales(); }
class Tuna implements Fish, Piano {
    public int getNumberOfScales() { return 91; }
}
