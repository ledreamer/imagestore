package satyaki.com.imagestore;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

//Created by satyaki on 5/11/15.


public class imagecapture extends Activity {

    private static final int CAMERA_PIC_REQUEST = 1111;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagecapture);

        Button cameraButton = (Button) findViewById(R.id.camerabutton);
        Button galleryButton = (Button) findViewById(R.id.gallerybutton);

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent intent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                startActivityForResult(intent, CAMERA_PIC_REQUEST);
            }





        });
    }
}




/*
package satyaki.com.imagestore;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;

*/
/**
 * Created by satyaki on 5/11/15.
 *//*

public class imagecapture extends Activity {

    static final int CAMERA_PIC_REQUEST = 1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.imagecapture);

        Button cameraButton = (Button) findViewById(R.id.camerabutton);
        Button galleryButton = (Button) findViewById(R.id.gallerybutton);

        cameraButton.setOnClickListener(new View.OnClickListener() {
            @Override

            public void onClick(View v) {
                Intent takePictureintent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                if(takePictureintent.resolveActivity(getPackageManager()) != null){
                    startActivityForResult(takePictureintent, CAMERA_PIC_REQUEST);
                }

                @Override
                        protected void onActivityResult(int requestCode, int resultCode, Intent data){

                    if(requestCode==CAMERA_PIC_REQUEST && resultCode== RESULT_OK){
                        Bundle extras = data.getExtras();
                        Bitmap imageBitmap = (Bitmap) extras.get("data");
                        mImageView.setImageBitmap(imageBitmap);
                    }
                }

*/


                //bakchodi
                /*File f = new File(android.os.Environment.getExternalStorageDirectory(), "temp.jpg");
                intent.putExtra(MediaStore.EXTRA_OUTPUT, Uri.fromFile(f));

                startActivityForResult(intent, CAMERA_PIC_REQUEST);

                protected void onActivityResult(int requestCode, int resultCode, Intent data){
                    *//*super.onActivityResult(requestCode, resultCode, data);*//*
                    if(requestCode == CAMERA_PIC_REQUEST *//*RESULT_OK*//*){
                        Bitmap bitmap;
                        BitmapFactory.Options bitmapOptions = new BitmapFactory.Options();

                        picturePath = f.getAbsolutePath();
                        System.out.println(picturePath+" Picture path inside the Onactivity method")
                    }
            }*/
            /*}





        });
    }
}
*/









