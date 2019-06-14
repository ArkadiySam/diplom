package tools;

import java.util.List;

public class Translator {

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
