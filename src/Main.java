/**
 * Написать класс с двумя методами:
 * 1. принимает объекты, имплементирующие интерфейс serializable, и сохраняющие их в файл.
 * Название файл - class.getName() + "_" + UUID.randomUUID().toString()
 * 2. принимает строку вида class.getName() + "_" + UUID.randomUUID().toString() и загружает объект из файла и удаляет этот файл.
 *
 * Что делать в ситуациях, когда файла нет или в нем лежит некорректные данные - подумать самостоятельно.
 */

public class Main {
    public static void main(String[] args) {

        SerializableExample objToSave = new SerializableExample("Java is great, but.....");
        SerializableTextFileManager.saveObject(objToSave);

        SerializableExample loadedObject = (SerializableExample) SerializableTextFileManager.loadObject();
        if (loadedObject != null) {
            System.out.println("Loaded object: " + loadedObject.getData());
        }


          SerializableTextFileManager.deleteFile("file.txt");

    }
}