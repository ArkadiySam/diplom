package tools;


import java.util.ArrayList;
import java.util.List;

public class Translator {

    public byte[] changeNew(byte[] data, String oldValue, List<String> newValue){
        byte [] valueCode = oldValue.getBytes();
        if(newValue.size() == 0) {
            return data;
        }
        List<Byte> total = new ArrayList<>();
        for (byte datum : data)
            total.add(datum);
        int index;
        while (true) {
            index = total.indexOf(valueCode[0]);
            if(index + 1 != total.indexOf(valueCode[1]))
                index = -1;
            if(index == -1 || newValue.size() == 0) {
                break;
            }
            byte [] newValueCode = newValue.get(0).getBytes();
            total.remove(index);
            total.remove(index);
            for (int i = index; i < index + newValueCode.length; i++)
                total.add(i, newValueCode[i - index]);
            newValue.remove(0);
        }
        byte [] result = new byte[total.size()];
        for(int i = 0; i < result.length; i++)
            result[i] = total.get(i);
        return result;
    }

    public byte[] change(byte[] data, String oldValue, List<String> newValue){
        byte [] valueCode = oldValue.getBytes();
        if(newValue.size() == 0)
            return data;
        byte [] newValueCode = newValue.get(0).getBytes();
        byte[] total = new byte[data.length + newValueCode.length - valueCode.length];
        int index = Translator.indexOf(data, valueCode);
        if(index != -1) {
            int totalCounter = 0;
            for (int i = 0; i < index; i++)
                total[totalCounter++] = data[i];

            for (int j = 0; j < newValueCode.length; j++)
                total[totalCounter++] = newValueCode[j];

            for (int i = index + valueCode.length; i < data.length; i++)
                total[totalCounter++] = data[i];

            newValue.remove(0);
            return total;
        }
        else
            return data;
    }

    private static int indexOf(byte[] array, byte[] subArray) {
        int res = -1;

        if (subArray.length > 0) {
            again:
            for (int i = 0, j = array.length - subArray.length, k; i <= j; i += k) {
                k = 0;
                for (int m = 0; m < subArray.length; m++) {
                    ++k;
                    if (array[i + m] != subArray[m]) {
                        continue again;
                    }
                }
                res = i;
            }
        }

        return res;
    }
}
