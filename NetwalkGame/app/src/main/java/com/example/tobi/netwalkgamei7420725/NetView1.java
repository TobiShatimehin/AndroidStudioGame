package com.example.tobi.netwalkgamei7420725;

/**
 * Created by Tobi on 09/02/2017.
 */

import android.app.AlertDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.GestureDetector;
import android.view.MotionEvent;
import android.view.View;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;


public class NetView1 extends View {

    private NetwalkGrid View = new NetwalkGrid(7, 7);
    private GestureDetector  mGestureDetector;
    private int eachCellWidth, eachCellHeight;
    private int moves = 0;
    int [] ArrayDone;

    Bitmap bmp_a;
    Bitmap bmp_b;
    Bitmap bmp_c;
    Bitmap bmp_d;
    Bitmap bmp_e;
    Bitmap bmp_f;
    Bitmap bmp_g;
    Bitmap bmp_h;
    Bitmap bmp_i;
    Bitmap bmp_j;
    Bitmap bmp_k;
    Bitmap bmp_l;
    Bitmap bmp_m;
    Bitmap bmp_n;
    Bitmap bmp_o;
    Bitmap bmp_p;
    Bitmap bmp_q;
    Bitmap bmp_r;
    Bitmap bmp_s;
    Bitmap bmp_t;
    Bitmap bmp_u;
    Bitmap bmp_v;
    Bitmap bmp_w;
    Bitmap bmp_x;
    Bitmap bmp_y;
    Bitmap bmp_z;
    Bitmap bmp_1;
    Bitmap bmp_2;



    ArrayList<Bitmap> bitmapArray = new ArrayList<Bitmap>();


    public NetView1(Context context) {
        super(context);
        init();

        mGestureDetector = new GestureDetector(context, new MyGestureListener());

    }

    Paint mGridPaint = new Paint(Paint.ANTI_ALIAS_FLAG);


    protected void onDraw(Canvas canvas) {
        super.onDraw(canvas);



        eachCellWidth = getWidth() / View.getColumns();
        eachCellHeight = (getHeight() -400) / View.getRows();



        for (int rows = 0; rows < View.getRows(); rows++) {
            for (int cols = 0; cols < View.getColumns(); cols++) {


                canvas.drawLine(0, cols * eachCellHeight, getWidth(), cols * eachCellHeight, mGridPaint);
                canvas.drawLine(rows * eachCellWidth, 0, rows * eachCellWidth, (getHeight() -400), mGridPaint);
                canvas.drawText("moves : " + moves, 400, 2000, mGridPaint);
                mGridPaint.setTextSize(100);



                int cellContent = View.getGridElem(cols,rows);

                if (cellContent == 40){

                    canvas.drawBitmap(bmp_a, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 36){

                    canvas.drawBitmap(bmp_b, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 34){

                    canvas.drawBitmap(bmp_c, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 33){

                    canvas.drawBitmap(bmp_d, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 3) {

                    canvas.drawBitmap(bmp_e, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 10){

                    canvas.drawBitmap(bmp_f, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 6){

                    canvas.drawBitmap(bmp_g, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 14){

                    canvas.drawBitmap(bmp_h, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 9){

                    canvas.drawBitmap(bmp_i, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 5){

                    canvas.drawBitmap(bmp_j, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 13){

                    canvas.drawBitmap(bmp_k, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 12){

                    canvas.drawBitmap(bmp_l, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 11){

                    canvas.drawBitmap(bmp_m, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 7){

                    canvas.drawBitmap(bmp_n, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 88){

                    canvas.drawBitmap(bmp_o, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 84){

                    canvas.drawBitmap(bmp_p, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 92){

                    canvas.drawBitmap(bmp_q, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }
                if (cellContent == 82){

                    canvas.drawBitmap(bmp_r, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 90){

                    canvas.drawBitmap(bmp_s, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 86){

                    canvas.drawBitmap(bmp_t, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 94){

                    canvas.drawBitmap(bmp_u, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 81){

                    canvas.drawBitmap(bmp_v, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 89){

                    canvas.drawBitmap(bmp_w, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 85){

                    canvas.drawBitmap(bmp_x, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 93){

                    canvas.drawBitmap(bmp_y, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 83){

                    canvas.drawBitmap(bmp_z, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 91){

                    canvas.drawBitmap(bmp_1, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }

                if (cellContent == 87){

                    canvas.drawBitmap(bmp_2, null, new Rect(cols * eachCellWidth, rows * eachCellHeight, cols * eachCellWidth + eachCellWidth, rows * eachCellHeight + eachCellHeight), null);
                }


            }

        }

    }
    // onTouchEvent() method of the View class gets called each time you perform any
    // touch event with screen

    public boolean onTouchEvent(MotionEvent ev)    {
        // The line below passes the event to the onTouchEvent method of the GestureDetector class.
        // This analyzes the event and if applicable triggers the appropriate callbacks in the
        // GestureDetector.OnSimpleGestureListener class.


        this.mGestureDetector.onTouchEvent(ev);

        return super.onTouchEvent(ev);
    }


    // This GestureListener class is enclosed within the GameView class


    class MyGestureListener extends GestureDetector.SimpleOnGestureListener     {

        // You should always include onDown() and it should always return true.
        // Otherwise the GestureListener may ignore other events.


        public boolean onDown(MotionEvent ev) {
            return true;
        }

        public void onLongPress(MotionEvent ev) {
            // Get location of touch, calculate the column that has been clicked.
            // Call the playToken method of Game to make coloured piece appear.
            // Use invalidate() to cause view to be redrawn.

            int x = (int) ev.getX();
            int y = (int) ev.getY();

            int touchX = (x / eachCellWidth);
            int touchY = (y / eachCellHeight);

            View.rotateRight(touchX, touchY);


            invalidate();

            moves = moves + 1;

            if (Arrays.equals(ArrayDone, View.mGrid))


            {

                AlertDialog.Builder message = new AlertDialog.Builder(Medium.mDialogContext);
                message.setTitle("Game completed in "+ moves +" moves, Play again?");
                message.setPositiveButton("Yes", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent intent = new Intent(Medium.mDialogContext, level.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        Medium.mDialogContext.startActivity(intent);
                       // getContext().startActivity(intent);
                    }
                });
                message.setNegativeButton("No", new DialogInterface.OnClickListener() {
                    public void onClick(DialogInterface dialog, int whichButton) {
                        Intent intent = new Intent(Medium.mDialogContext, MainActivity.class);
                        intent.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                        Medium.mDialogContext.startActivity(intent);
                        // getContext().startActivity(intent);
                    }
                });
                message.show();
            }
        }

    }  // End of MyGestureListener class

    public void init() {

        mGridPaint.setStyle(Paint.Style.FILL_AND_STROKE); // fill and gives a stroke to the grid
        mGridPaint.setColor(0xff0000ff); // sets the colour of the grid lines

        ArrayDone = View.mGrid.clone();

        bmp_a = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridnode1);
        bmp_b = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridnode2);
        bmp_c = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridnode3);
        bmp_d = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridnode4);
        bmp_e = BitmapFactory.decodeResource(getResources(), R.drawable.pipe1);
        bmp_f = BitmapFactory.decodeResource(getResources(), R.drawable.pipe2);
        bmp_g = BitmapFactory.decodeResource(getResources(), R.drawable.pipe3);
        bmp_h = BitmapFactory.decodeResource(getResources(), R.drawable.pipe4);
        bmp_i = BitmapFactory.decodeResource(getResources(), R.drawable.pipe5);
        bmp_j = BitmapFactory.decodeResource(getResources(), R.drawable.pipe6);
        bmp_k = BitmapFactory.decodeResource(getResources(), R.drawable.pipe7);
        bmp_l = BitmapFactory.decodeResource(getResources(), R.drawable.pipe8);
        bmp_m = BitmapFactory.decodeResource(getResources(), R.drawable.pipe9);
        bmp_n = BitmapFactory.decodeResource(getResources(), R.drawable.pipe10);
        bmp_o = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver1);
        bmp_p = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver2);
        bmp_q = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver3);
        bmp_r = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver4);
        bmp_s = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver5);
        bmp_t = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver6);
        bmp_u = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver7);
        bmp_v = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver8);
        bmp_w = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver9);
        bmp_x = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver10);
        bmp_y = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver11);
        bmp_z = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver12);
        bmp_1 = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver13);
        bmp_2 = BitmapFactory.decodeResource(getResources(), R.drawable.netwalkgridserver14);



        bitmapArray.add(bmp_a);
        bitmapArray.add(bmp_b);
        bitmapArray.add(bmp_c);
        bitmapArray.add(bmp_d);
        bitmapArray.add(bmp_e);
        bitmapArray.add(bmp_f);
        bitmapArray.add(bmp_g);
        bitmapArray.add(bmp_h);
        bitmapArray.add(bmp_i);
        bitmapArray.add(bmp_j);
        bitmapArray.add(bmp_k);
        bitmapArray.add(bmp_l);
        bitmapArray.add(bmp_m);
        bitmapArray.add(bmp_n);
        bitmapArray.add(bmp_o);
        bitmapArray.add(bmp_p);
        bitmapArray.add(bmp_q);
        bitmapArray.add(bmp_r);
        bitmapArray.add(bmp_s);
        bitmapArray.add(bmp_t);
        bitmapArray.add(bmp_u);
        bitmapArray.add(bmp_v);
        bitmapArray.add(bmp_w);
        bitmapArray.add(bmp_x);
        bitmapArray.add(bmp_y);
        bitmapArray.add(bmp_z);
        bitmapArray.add(bmp_1);
        bitmapArray.add(bmp_2);




        for (int rows = 0; rows < View.getRows(); rows++) {
            for (int cols = 0; cols < View.getColumns(); cols++) {

                Random rand = new Random(1 - 3);
                for (int change = 1; change < rand.nextInt(); change++); {

                    View.rotateRight(cols, rows);


                }

            }


        }
    }}
