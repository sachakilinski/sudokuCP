use sudoku;

select n11.n, n12.n, n13.n, n14.n,
       n21.n, n22.n, n23.n, n24.n,
       n31.n, n32.n, n33.n, n34.n,
       n41.n, n42.n, n43.n, n44.n
  from NUMS n11, NUMS n12, NUMS n13, NUMS n14,
       NUMS n21, NUMS n22, NUMS n23, NUMS n24,
       NUMS n31, NUMS n32, NUMS n33, NUMS n34,
       NUMS n41, NUMS n42, NUMS n43, NUMS n44
  where n11.n <> n12.n and n11.n <> n13.n and n11.n <> n14.n
    and n11.n <> n21.n and n11.n <> n31.n and n11.n <> n41.n
    and n11.n <> n22.n

    and n21.n <> n22.n and n21.n <> n23.n and n21.n <> n24.n
    and n21.n <> n31.n and n21.n <> n41.n
    and n21.n <> n12.n

    and n31.n <> n32.n and n31.n <> n33.n and n31.n <> n34.n
    and n31.n <> n41.n
    and n31.n <> n42.n

and n41.n <> n42.n and n41.n <> n43.n and n41.n <> n44.n
    and n41.n <> n32.n

and n12.n <> n13.n and n12.n <> n14.n
    and n12.n <> n22.n and n12.n <> n32.n and n12.n <> n42.n

    and n22.n <> n23.n and n22.n <> n24.n
    and n22.n <> n32.n and n22.n <> n42.n

    and n32.n <> n33.n and n32.n <> n34.n
    and n32.n <> n42.n

and n42.n <> n43.n and n42.n <> n44.n

    and n13.n <> n14.n
    and n13.n <> n23.n and n13.n <> n33.n and n13.n <> n43.n
    and n13.n <> n24.n

and n23.n <> n24.n
    and n23.n <> n33.n and n23.n <> n43.n
    and n23.n <> n14.n

and n33.n <> n34.n
    and n33.n <> n43.n
    and n33.n <> n44.n

and n43.n <> n44.n
    and n43.n <> n34.n

    and n14.n <> n24.n and n14.n <> n34.n and n14.n <> n44.n
and n24.n <> n34.n and n24.n <> n44.n
and n34.n <> n44.n


/* ... board ... */
    and n11.n = 3
    and n32.n = 1
/* ... */
    and n43.n = 2
